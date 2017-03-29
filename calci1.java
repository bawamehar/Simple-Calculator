package calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
// final calculator
public class calci1 extends Application {
	calculate cl= new calculate();
	TextField t1;
	Button b0, b1, b3, b2, b4, b5, b6, b7 ,b8, b9, add, sub, mul,div,reset,equals;
	public static void main(String args[]){
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		arg0.setTitle("Calculator");
		GridPane ap = new GridPane();
		ap.setHgap(10);
		ap.setVgap(10);
		ap.setPadding(new Insets(10,10,10,10));
		b0= new Button("0");
		b1= new Button("1");
		b2= new Button("2");
		b3= new Button("3");
		b4= new Button("4");
		b5= new Button("5");
		b6= new Button("6");
		b7= new Button("7");
		b8= new Button("8");
		b9= new Button("9");
		add= new Button("+");
		sub= new Button("-");
		mul= new Button("*");
		div= new Button("/");
		reset= new Button("CE");
		equals= new Button("=");
		t1 = new TextField();
		
		ap.setConstraints(t1, 1, 4);
		ap.setConstraints(b1, 0, 0);
		ap.setConstraints(b2, 1, 0);
		ap.setConstraints(b3, 2, 0);
		ap.setConstraints(b4, 0, 1);
		ap.setConstraints(b5, 1, 1);
		ap.setConstraints(b6, 2, 1);
		ap.setConstraints(b7, 0, 2);
		ap.setConstraints(b8, 1, 2);
		ap.setConstraints(b9, 2, 2);
		ap.setConstraints(b0, 0, 3);
		ap.setConstraints(add, 3, 0);
		ap.setConstraints(sub, 3, 1);
		ap.setConstraints(mul, 3, 2);
		ap.setConstraints(div, 3, 3);
		ap.setConstraints(reset, 1, 3);
		ap.setConstraints(equals, 4, 4);
		b1.setOnAction(e->{one();});
		b2.setOnAction(e->{two();});
		b3.setOnAction(e->{three();});
		b4.setOnAction(e->{four();});
		b5.setOnAction(e->{five();});
		b6.setOnAction(e->{six();});
		b7.setOnAction(e->{seven();});
		b8.setOnAction(e->{eight();});
		b9.setOnAction(e->{nine();});
		b0.setOnAction(e->{zero();});

		add.setOnAction(e-> {add();});
		sub.setOnAction(e-> {sub();});
		mul.setOnAction(e-> {mul();});
		div.setOnAction(e-> {div();});
		reset.setOnAction(e-> {reset();});
		equals.setOnAction(e->{equals();});


		ap.getChildren().addAll(equals,t1, b0, b1, b3, b2, b4, b5, b6, b7 ,b8, b9, add, sub, mul,div,reset);
		
		Scene scene = new Scene(ap,350,350);
		arg0.setScene(scene);
		arg0.show();
		
	}

	char ch= '0'; 
	int num1,num2,res;
	
	public void equals() 
	{
		num2=Integer.parseInt(t1.getText());
		if(ch=='+'){res=num1+num2;}
		if(ch=='-'){res=num1-num2;}
		if(ch=='*'){res=num1*num2;}
		if(ch=='/'){res=num1/num2;}
			t1.setText(""+res);
		
		
	}


	public void one()
	{
		t1.appendText("1");
	}
	
	public void two()
	{
		t1.appendText("2");
	}
	public void three()
	{
		t1.appendText("3");
	}
	public void four()
	{
		t1.appendText("4");		
	}
	public void five()
	{
		t1.appendText("5");
	}
		public void six()
	{
		t1.appendText("6");
	
	}
	public void seven()
	{
		t1.appendText("7");
	}
	public void eight()
	{
		t1.appendText("8");
	}
		
	
	public void nine()
	{
		t1.appendText("9");
	}
		
	
	public void zero()
	{
		t1.appendText("0");
	}
	

	public void add()
	{
		num1=Integer.parseInt(t1.getText());
		System.out.println(num1);
		t1.clear();
		ch='+';
	}
	public void sub()
	{
		num1=Integer.parseInt(t1.getText());
		System.out.println(num1);
		t1.clear();
		ch='-';
	}
	public void mul()
	{
		num1=Integer.parseInt(t1.getText());
		System.out.println(num1);
		t1.clear();
		ch='*';
	}
	public void div()
	{
		num1=Integer.parseInt(t1.getText());
		System.out.println(num1);
		t1.clear();
		ch='/';
	}
	public void reset() 
	{
        num1 = 0;
        num2 = 0;
        ch = '0';
        t1.setText("");
	}

	

} 


