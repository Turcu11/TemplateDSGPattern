public abstract class BaseGameLoader {
    public void load(){
        showLoadingScreen();
        createObjects();
        downloadResources();
        cleanUnnecessaryFiles();
        connectToServer();
        loadUsersProfiles();
        showWelcome();
    }

    abstract void showLoadingScreen();
    abstract void createObjects();
    abstract void downloadResources();
    abstract void cleanUnnecessaryFiles();
    void connectToServer(){
        System.out.println("connecting to the server");
    };
    abstract void loadUsersProfiles();
    abstract void showWelcome();
}
