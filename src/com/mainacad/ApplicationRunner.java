package com.mainacad;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class ApplicationRunner {
    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());


    public static void main(String[] args) {
      /*  v1
        String text = "Sum by division for 12345 is +";
        LOGGER.info( text +
                NumberManipulationService.getSumByDivision(12345));

        LOGGER.info("Sum by division for 12345 is +" +
                NumberManipulationService.getSumByType(12345));
    */
      // v2
     /* StringBuilder stringBuilder =
              new StringBuilder("some text - string Builder");
              stringBuilder.append(" , add some new text");

        StringBuffer stringBuffer =
                new StringBuffer("some text - string Buffer");
                stringBuffer.append(" , add some new text");
         LOGGER.info(stringBuilder.toString());
         LOGGER.info(stringBuffer.toString());
*/
     // v3
     String testText = " abc1de 2fg3h i4jkl5mn ";

     String modifiedText = testText.trim();
     String[] words = modifiedText.split(" ");

     modifiedText = modifiedText.replaceAll("[a-zA-Z]","");
        LOGGER.info("Original: " + testText);
        LOGGER.info("Modified: " + modifiedText);
        LOGGER.info("Word: " + StringUtils.join(words, ", "));   // Методы из внешней библиотеки
        String name = "\"Alexander\"";
        int age = 370;
        LOGGER.info( String.format("My name is %s, I'm %d years old.", name, age));


        System.out.println("Input Number");
        String input = "";
        String text = "";
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine(); // считывает данные с клавиатуры

        LOGGER.info("Input: " + input);

    }
}
