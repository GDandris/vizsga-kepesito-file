package hu.nive.ujratervezes.io.phonebook;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output){
        if(contacts == null || output == null){
            throw new IllegalArgumentException();
        }
        else {
            try {
                FileWriter outputWriter = new FileWriter(output);
                for (Map.Entry<String, String> entry : contacts.entrySet()) {
                    outputWriter.append(entry.getKey() + ": " + entry.getValue() + "\n");
                }
                outputWriter.close();
            } catch (IOException ignored) {
            }
        }
    }
}