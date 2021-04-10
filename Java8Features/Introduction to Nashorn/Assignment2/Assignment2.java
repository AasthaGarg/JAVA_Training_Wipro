import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Assignment2 {
	public static void main(String[] args){
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("nashorn");
		FileReader fr;
		try {
			fr = new FileReader("E:\\Java Projects\\Folder Wipro\\Introduction to Nashorn\\Assignment2\\Demo.js");
			engine.eval(fr);
			Invocable invocable=(Invocable)engine;
			String result=invocable.invokeFunction("isPrime",2).toString();
			System.out.println(result);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (ScriptException e) {
			
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
