package ua.mainacademy;

import ua.mainacademy.service.StringCreator;

import java.util.logging.Logger;

public class Application {

    public static void main(String[] args) {
        final Logger LOGGER=Logger.getLogger(Application.class.getName());
        long one = 2132452567;
        long two = 248267867 ;

        StringBuilder result = StringCreator.multiplyStringCreator(one,two);
        LOGGER.info(result.toString());
    }


}

