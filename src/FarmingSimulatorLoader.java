public class FarmingSimulatorLoader extends BaseGameLoader {

    //for each of those methods it should be implemented the actual logic specific to this game
    @Override
    void showLoadingScreen() {
        System.out.println("show the loading screen");
    }

    @Override
    void createObjects() {
        System.out.println("Creating the map and the tractors and other equipment objects");
    }

    @Override
    void downloadResources() {
        System.out.println("downloading the audio and video files");
    }

    @Override
    void cleanUnnecessaryFiles() {
        System.out.println("cleaning the temporary files");
    }

    @Override
    void loadUsersProfiles() {
        System.out.println("loading the users profiles");
    }

    @Override
    void showWelcome() {
        System.out.println("show welcome menu");
    }
}
