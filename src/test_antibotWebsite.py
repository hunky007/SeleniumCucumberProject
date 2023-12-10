#import pytest
from selenium import webdriver
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.firefox import GeckoDriverManager
from PIL import Image
from Screenshot import Screenshot_Clipping 


# @pytest.fixture(scope='class') - Will be using this fixture into other classes in the framework 
def setup():
    
    # Initializing chromedriver 
    driver = webdriver.Firefox(executable_path=GeckoDriverManager().install())
    wait = WebDriverWait(driver, 10)
    
    # Navigating to Antibot website
    driver.get(https://bot.sannysoft.com/)
    driver.maximize_window()
    
    # Taking screenshot of the webpage and saving the image locally
    ss = Screenshot_clipping.Screenshot()
    screen_shot = ss.full_screenshot(driver, save_path = '/path', image_name= 'name.png')
    screen = Image.open(screen_shot)
    screen.show()
    
    # Closing the browser
    yield
    driver.close()