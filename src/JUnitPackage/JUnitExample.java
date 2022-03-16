package JUnitPackage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class JUnitExample<UserValidation> {

		    @Test
		    public void givenFirstName_WhenProper_ShouldReturn_True() {
		        UserValidation userValidation = new UserValidation();
		        boolean result = userValidation.validateFirstName("Prachi");
		        Assert.assertEquals(true,result);
		    }
		    @Test
		    public void givenFirstName_WhenNotProper_ShouldReturn_False() {
		        UserValidation userValidation = new UserValidation();
		        boolean result = userValidation.validateFirstName("Pr");
		        Assert.assertEquals(false,result);
		    }
		    @Test
		    public void givenLastName_WhenProper_ShouldReturn_True() {
		        UserValidation userValidation = new UserValidation();
		        boolean result = userValidation.validateLastName("Mohanty");
		        Assert.assertEquals(true,result);
		    }
		    @Test
		    public void givenLastName_WhenNotProper_ShouldReturn_False() {
		    	UserValidation  userValidation = new UserValidation ();
		        boolean result = userValidation.validateLastName("Mo");
		        Assert.assertEquals(false,result);
		    }
		    @Test
		    public void givenEmail_WhenProper_ShouldReturn_True() {
		        UserValidation userValidation = new UserValidation ();
		        boolean result = userValidation.validateEmail("abc.xyz@bl.co.in");
		        Assert.assertEquals(true,result);
		    }
		    @Test
		    public void givenEmail_WhenNotProper_ShouldReturn_False() {
		    	UserValidation userValidation = new UserValidation();
		        boolean result = userValidation.validateEmail("prachi@.com");
		        Assert.assertEquals(false,result);
		    }
		    @Test
		    public void givenPhone_WhenProper_ShouldReturn_True() {
		        UserValidation userValidation = new UserValidation();
		        boolean result = userValidation.validatePhone("918105215414");
		        Assert.assertEquals(true,result);
		    }
		    @Test
		    public void givenPhone_WhenNotProper_ShouldReturn_False() {
		        UserValidation userValidation = new UserValidation();
		        boolean result = userValidation.validatePhone("8105215414");
		        Assert.assertEquals(false,result);
		    }
		    @Test
		    public void givenPassword_WhenProper_ShouldReturn_True() {
		        UserValidation userValidation = new UserValidation();
		        boolean result = userValidation.validatePassword("abcdfdA@fg0");
		        Assert.assertEquals(true,result);
		    }
		    @Test
		    public void givenPassword_WhenNotProper_ShouldReturn_False() {
		    	UserValidation  userValidation = new UserValidation();
		        boolean result = userValidation.validatePassword("adasdas0daS");
		        Assert.assertEquals(false,result);
		    }
		}