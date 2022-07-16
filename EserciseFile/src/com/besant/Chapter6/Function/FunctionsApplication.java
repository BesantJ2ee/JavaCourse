package com.besant.Chapter6.Function;

import java.nio.channels.AcceptPendingException;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

public class FunctionsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBinaryOperator binaryOperator = (x, y) ->
        {
            
            return x * y;
        };
  
        System.out.println("division  "
                           + binaryOperator.applyAsInt(10, 2));
	
        Consumer<Integer> consumerOperation= (x)->
        {
        	System.out.println(x*x);
        };
        
        Consumer<Integer> consumer2Operation= (x)->
        {
        	System.out.println(x*x);
        };
        
	    List<Integer> value= Arrays.asList(12,13,14,25);
	
	    value.stream().forEach(consumer2Operation);
	    
	    
	    
	    Stream.of("Twix", "Snickers", "Mars")
	    .mapMulti((s, c) -> {
	      c.accept(s.toUpperCase());
	      c.accept(s.toLowerCase());
	    })
	    .forEach(System.out::println);
 	    
	}
	
	

}
