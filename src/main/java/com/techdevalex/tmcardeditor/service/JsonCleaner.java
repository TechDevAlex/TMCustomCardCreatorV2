package com.techdevalex.tmcardeditor.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.File;
import java.io.IOException;

public class JsonCleaner {

    public static void cleanJson(String inputFilePath, String outputFilePath) throws IOException {
        // Initialize Jackson ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        // Read JSON file into a JsonNode array
        JsonNode rootNode = objectMapper.readTree(new File(inputFilePath));

        // Check if the root is an array
        if (!rootNode.isArray()) {
            throw new IllegalArgumentException("Input JSON must be an array.");
        }

        // Iterate through each card in the array
        for (JsonNode card : rootNode) {
            if (card.isObject()) {
                // Remove unwanted fields
                ((ObjectNode) card).remove("metadata");
                ((ObjectNode) card).remove("renderData");
                ((ObjectNode) card).remove("cardNumber");
                ((ObjectNode) card).remove("productionBox");
            }
        }

        // Write the cleaned JSON to a new file
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFilePath), rootNode);
    }

    public static void main(String[] args) {
        try {
            String inputFilePath = "src/main/resources/cards.json";
            String outputFilePath = "src/main/resources/cleaned_cards.json";

            cleanJson(inputFilePath, outputFilePath);
            System.out.println("Cleaned JSON file written to: " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
