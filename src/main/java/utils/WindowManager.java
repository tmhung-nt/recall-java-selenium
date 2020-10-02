package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigation;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        this.navigation = this.driver.navigate();
    }

    public void goBack(){
        navigation.back();
    }

    public void goForward(){
        navigation.forward();
    }

    public void refreshPage(){
        navigation.refresh();
    }

    public void goTo(String url){
        navigation.to(url);
    }

    public void switchToWindow(String pageTitle){
        var windows = driver.getWindowHandles();
        System.out.println("Number of tabs: " + windows.size());
        System.out.println("Window Handles:");
        windows.forEach(System.out::println);

        for(String window : windows){
            System.out.println("Window Handle: " + window);
            driver.switchTo().window(window);
            System.out.println("Current Page Title: " + driver.getTitle());
            if(pageTitle.equals(driver.getTitle())){
                break;
            }
        }
    }


}
