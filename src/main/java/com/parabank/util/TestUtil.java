package com.parabank.util;

import com.parabank.base.TestBase;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestUtil extends TestBase {

    static Workbook book;
    static Sheet sheet;
    public TestUtil()
    {
        super();
    }

    public static void clickOnElement(WebElement element)
    {
        element.click();
    }

    public static void sendValues(WebElement element, String value)
    {
        element.sendKeys(value);
    }

    public static Object[][] getTestData(String sheetName)
    {
        FileInputStream file = null;
        try {
            file = new FileInputStream("C:\\Users\\HP\\IdeaProjects\\Para_Bank_Testing\\src\\main\\java\\com\\parabank\\testdata\\Register_Data.xlsx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = book.getSheet("Register");
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
            }
        }
        return data;
    }
}
