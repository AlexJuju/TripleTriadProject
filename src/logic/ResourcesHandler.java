package logic;

import config.Resource;

import java.io.File;

public class ResourcesHandler {

    public static String getPath(int resource) {
        String file = null, path =  ".." + File.separator + "view" + File.separator;

        switch ( resource ) {
            case Resource.MAIN_MENU_SCREEN:
                file = "MainMenu.fxml";
                break;

            case Resource.GLOSSARY_SCREEN:
                file = "Glossary.fxml";
                break;

            case Resource.CARD_MODEL:
                file = "CardModel.fxml";
                break;

            default:
                System.out.println("ResourcesHandler: Resource not found.");
        }
        return path + file;
    }
}
