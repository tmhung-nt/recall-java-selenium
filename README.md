# Java Selenium Maven
[![CircleCI](https://circleci.com/gh/tmhung-nt/recall-java-selenium.svg?style=svg)](https://circleci.com/gh/tmhung-nt/recall-java-selenium)
[![Build Status](https://travis-ci.org/tmhung-nt/recall-java-selenium.svg)](https://travis-ci.org/tmhung-nt/recall-java-selenium)  

## To recall forgot stuff :)  
Thanks to:  
- https://testautomationu.applitools.com/selenium-webdriver-tutorial-java/  
- https://octopus.com/blog/selenium/21-travis-ci/travis-ci  
- https://stackoverflow.com/questions/59932037/test-ng-and-circle-ci-configuration  

## NOTES  
1. To switch frame  
- use driver.switchTo().frame() and input parameter is ID/Name (String not By) or WebElement
- don't care about `frameset` tag
