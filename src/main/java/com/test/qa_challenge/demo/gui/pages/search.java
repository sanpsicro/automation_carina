/*
 * Copyright 2013-2019 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.test.qa_challenge.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class search extends AbstractPage {

    //textbox
    @FindBy(xpath = "//input[contains(@placeholder,'Search foods...')]")
    public ExtendedWebElement INPUT_search;

    @FindBy(xpath = "//td[contains(.,'Butter, with salt')]")
    public ExtendedWebElement TXT_noChosenElem;


    @FindBy(xpath = "(//td[contains(.,\"Butter, with salt\")])[1]")
    public ExtendedWebElement TXT_chosenElem;


    public search(WebDriver driver) {
        super(driver);
        setPageURL("");
    }


    public search setText(ExtendedWebElement element, String value) {
        element.type(value);
        return new search(driver);
    }

    public search click_(ExtendedWebElement element) {
        element.click();
        return new search(driver);
    }

}


