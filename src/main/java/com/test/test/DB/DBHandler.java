package com.test.test.DB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Component
public class DBHandler {
    Logger logger = LoggerFactory.getLogger(DBHandler.class);

    @Autowired
    private DatabaseInsertData db;
    int Data_INSERT_LIMIT = 1000;

    public void init() {
        insertFromFile();


    }

    private void insertFromFile() {
        List<File> files = new ArrayList<>();
        try (Stream<Path> listFile = Files.list(Paths.get("C:\\Users\\p.mesgarha\\Desktop\\savedFile2"))) {
            listFile.forEach(o -> files.add(new File(o.toFile().getAbsolutePath())));
        } catch (Exception e) {
        }


        for (File f : files) {

            ArrayList<String[]> Data = new ArrayList<>(); //initializing a new ArrayList out of String[]'s
            try (BufferedReader TSVReader = new BufferedReader(new FileReader(f))) {
                String line = null;
                int i = 0;
                while ((line = TSVReader.readLine()) != null && i < Data_INSERT_LIMIT) {
                    String[] lineItems = line.split("\t"); //splitting the line and adding its items in String[]
                    if (i == 0) {
                        i++;
                        continue;
                    }

                    switch (f.getName()) {
                        case "title.akas.tsv":
                            db.insertAkas(Arrays.asList(lineItems));
                            break;

                        case "title.episode.tsv":
                            db.insertEpisode(Arrays.asList(lineItems));
                            break;

                        case "title.ratings.tsv":
                            db.insertRate(Arrays.asList(lineItems));
                            break;

                        case "title.principals.tsv":
                            db.insertPrincipal(Arrays.asList(lineItems));
                            break;

                        case "name.basics.tsv":
                            db.insertName(Arrays.asList(lineItems));
                            break;
                        case "title.basics.tsv":
                            db.insertBasic(Arrays.asList(lineItems));
                            break;

                        case "title.crew.tsv":
                            db.insertCrew(Arrays.asList(lineItems));
                            break;
                    }

                    i++;
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
            }
        }
    }
}
