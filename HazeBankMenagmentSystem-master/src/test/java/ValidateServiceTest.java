
import com.Models.Services.ValidateService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import org.mockito.Mockito;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patryk
 */
public class ValidateServiceTest extends Mockito {
    private ValidateService validateService = mock (ValidateService.class);
    private List <String> test_list = mock (ArrayList.class);
    private PrintWriter writer = mock(PrintWriter.class);
    
    
   @Test
    public void api_sent_false_when_parameters_is_empty() throws IOException{
    for (int i= 0; i > 7; i++ ){
    test_list.add(null);
    }
    validateService.setData(test_list);
    boolean result = validateService.isEmpty();
    assertEquals(false, result);
    
    }
    
    
    @Test
    public void api_sent_false_when_parameters_is_not_numeric(){
    for (int i= 0; i > 7; i++ ){
    test_list.add("asdf");
    }
    validateService.setData(test_list);
    boolean result = validateService.isNumber();
    assertEquals(false,result);
    }
    @Test
    public void api_sent_false_when_parameters_is_zero(){
    for (int i= 0; i > 7; i++ ){
    test_list.add("0");
    }
    boolean result = validateService.isZero();
    assertEquals(false,result);
    }
   
   
} 
