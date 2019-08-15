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
package com.test.qa_challenge;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.test.qa_challenge.demo.gui.pages.home;
import com.test.qa_challenge.demo.gui.pages.search;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

/**
 * This sample shows how create Web test.
 *
 * @author qpsdemo
 */
public class demo_test extends AbstractTest {


    @Test(description = "none")
    @MethodOwner(owner = "sanpsicro")
    public void searchProduct(){
        home loginPage  = new home(getDriver());
        loginPage.open();


        search registroPage = loginPage.goRegistro();

        registroPage.setText(registroPage.INPUT_search,"a");




    }


    @Test(description = "none")
    @MethodOwner(owner = "sanpsicro")
    public void selectProduct(){
        home loginPage  = new home(getDriver());
        loginPage.open();

        search registroPage = loginPage.goRegistro();

        registroPage.setText(registroPage.INPUT_search,"a");
        registroPage.click_(registroPage.TXT_chosenElem);





    }


    @Test(description = "none")
    @MethodOwner(owner = "sanpsicro")
    public void unselectProduct(){
        home loginPage  = new home(getDriver());
        loginPage.open();

        search registroPage = loginPage.goRegistro();

        registroPage.setText(registroPage.INPUT_search,"a");
        registroPage.click_(registroPage.TXT_chosenElem);
        registroPage.click_(registroPage.TXT_noChosenElem);


    }

}
