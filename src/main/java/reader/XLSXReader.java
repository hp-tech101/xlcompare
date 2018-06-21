package reader;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class XLSXReader {
    private XSSFWorkbook workbook=null;
    public XLSXReader(File fObj) {
        try {
            workbook=new XSSFWorkbook(fObj);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
    }

    public int getSheetCount() {
        return workbook.getNumberOfSheets();
    }
}
