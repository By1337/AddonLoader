package org.by1337.addonloader;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class AddonDescriptionFile {
    private final String name;
    private final String mainClass;
    private final String version;
    private final String description;
    private final Set<String> authors;

    public AddonDescriptionFile(JsonObject object) {
        name = object.get("name").getAsString();
        mainClass = object.get("main").getAsString();
        description = object.get("description").getAsString();
        version = object.get("version").getAsString();
        authors = toSetString(object.getAsJsonArray("authors"));
    }

    public AddonDescriptionFile(String json) {
        this(new Gson().fromJson(json, JsonObject.class));
    }

    private Set<String> toSetString(JsonArray array) {
        Set<String> list = new HashSet<>(array.size());
        for (JsonElement jsonElement : array) {
            list.add(jsonElement.getAsString());
        }
        return list;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public String getMain() {
        return mainClass;
    }

    @NotNull
    public String getVersion() {
        return version;
    }

    public String getMainClass() {
        return mainClass;
    }

    public String getDescription() {
        return description;
    }


    public Set<String> getAuthors() {
        return authors;
    }

}
