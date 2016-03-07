
import java.awt.* ;
import java.awt.event.*;
import java.util.Stack;

public class SciCalc extends Frame {
	Button submit, buttonp, buttonmi, buttonm, buttond, buttonpow, button1,buttonbra,buttonket,erase,
	button2,button3, button4, button5, button6, button7, button8, button9, button0, buttons, buttonc, buttont, buttonpi, buttone, buttonl, buttonpoint;
	TextField enter;
	Label save, help, help2, help3,help4;
	GridBagLayout grid = new GridBagLayout();
	GridBagConstraints straints = new GridBagConstraints();//preparing Layout-Tools
	public SciCalc (int w, int h){
		this.setTitle("Calc");
		this.setSize(w, h);
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize(); //set default-size
		this.setLocation((d.width-w)/2,(d.height-h)/2);

		addWindowListener(new MyWindowListener());
		ActionListener action = new Buttonpress(); //introducing EventListener

		setLayout(grid);//building Layout for buttons, the enter-field and Info-Boxes
		straints.gridx = 0;
		straints.gridy=0;
		straints.gridheight=1;
		straints.gridwidth=3;
		enter = new TextField("", 100);
		grid.setConstraints(enter, straints);
		add(enter);
		straints.gridy=1;straints.gridwidth=0; straints.gridx=0;
		save = new Label("Ihre letzte Eingabe: --                                                                                 "
				+ "                                                            "
				+ "                                                                                 ");
		grid.setConstraints(save, straints);
		add(save);
		straints.gridx=3; straints.gridy=0;
		straints.gridwidth=1;
		submit = new Button ("submit");
		grid.setConstraints(submit, straints);
		add(submit);
		submit.addActionListener(action);
		submit.setActionCommand("sub");
		straints.gridx=1; straints.gridy=2;
		erase = new Button (" erase ");
		grid.setConstraints(erase, straints);
		add(erase);
		erase.addActionListener(action);
		erase.setActionCommand("erase");
		straints.gridx=1; straints.gridy=3;
		buttonp = new Button("     +     ");
		grid.setConstraints(buttonp, straints);
		add(buttonp);
		buttonp.addActionListener(action);
		buttonp.setActionCommand("+");
		straints.gridx=2;
		buttonmi = new Button("      -     ");
		grid.setConstraints(buttonmi, straints);
		add(buttonmi);
		buttonmi.addActionListener(action);
		buttonmi.setActionCommand("-");
		straints.gridx=3;
		buttonm = new Button("     *     ");
		grid.setConstraints(buttonm, straints);
		add(buttonm);
		buttonm.addActionListener(action);
		buttonm.setActionCommand("*");
		buttond = new Button("      /     ");
		straints.gridy=4;straints.gridx=1;
		add(buttond); 
		grid.setConstraints(buttond, straints);
		buttond.addActionListener(action);
		buttond.setActionCommand("/");
		straints.gridx=2;
		buttonpow = new Button("     ^     ");
		grid.setConstraints(buttonpow, straints);
		add(buttonpow); 
		buttonpow.addActionListener(action);
		buttonpow.setActionCommand("^");
		straints.gridx=3;
		buttons = new Button("   sin   ");
		grid.setConstraints(buttons, straints);
		add(buttons); 
		buttons.addActionListener(action);
		buttons.setActionCommand("s");
		straints.gridy=5; straints.gridx=1;
		buttonc = new Button("   cos   ");
		grid.setConstraints(buttonc, straints);
		add(buttonc); 
		buttonc.addActionListener(action);
		buttonc.setActionCommand("c");
		straints.gridx=2;
		buttont = new Button("   tan   ");
		grid.setConstraints(buttont, straints);
		add(buttont); 
		buttont.addActionListener(action);
		buttont.setActionCommand("t");
		straints.gridx=3;
		buttonl = new Button("   log   ");
		grid.setConstraints(buttonl, straints);
		add(buttonl); 
		buttonl.addActionListener(action);
		buttonl.setActionCommand("l");
		straints.gridy=6; straints.gridx=1;
		button1 = new Button("     1     ");
		grid.setConstraints(button1, straints);
		add(button1); 
		button1.addActionListener(action);
		button1.setActionCommand("1");
		straints.gridx=2;
		button2 = new Button("     2     ");
		grid.setConstraints(button2, straints);
		add(button2); 
		button2.addActionListener(action);
		button2.setActionCommand("2");
		straints.gridx=3;
		button3 = new Button("     3     ");
		grid.setConstraints(button3, straints);
		add(button3); 
		button3.addActionListener(action);
		button3.setActionCommand("3");
		straints.gridy=7;straints.gridx=1;
		button4 = new Button("     4     ");
		grid.setConstraints(button4,straints);
		add(button4); 
		button4.addActionListener(action);
		button4.setActionCommand("4");
		straints.gridx=2;
		button5 = new Button("     5     ");
		grid.setConstraints(button5, straints);
		add(button5); 
		button5.addActionListener(action);
		button5.setActionCommand("5");
		straints.gridx=3;
		button6 = new Button("     6     ");
		grid.setConstraints(button6, straints);
		add(button6); 
		button6.addActionListener(action);
		button6.setActionCommand("6");
		straints.gridy=8; straints.gridx=1;
		button7 = new Button("     7     ");
		grid.setConstraints(button7, straints);
		add(button7); 
		button7.addActionListener(action);
		button7.setActionCommand("7");
		straints.gridx=2;
		button8 = new Button("     8     ");
		grid.setConstraints(button8, straints);
		add(button8); 
		button8.addActionListener(action);
		button8.setActionCommand("8");
		straints.gridx=3;
		button9 = new Button("     9     ");
		grid.setConstraints(button9, straints);
		add(button9); 
		button9.addActionListener(action);
		button9.setActionCommand("9");
		straints.gridy=9; straints.gridx=1;
		button0 = new Button("     0     ");
		grid.setConstraints(button0, straints);
		add(button0); 
		button0.addActionListener(action);
		button0.setActionCommand("0");
		straints.gridx=2;
		buttonpi = new Button("   Pi    "); //still building Layout
		grid.setConstraints(buttonpi, straints);
		add(buttonpi); 
		buttonpi.addActionListener(action);
		buttonpi.setActionCommand("Pi");
		straints.gridx=3;
		buttone = new Button("     e     ");
		grid.setConstraints(buttone, straints);
		add(buttone); 
		buttone.addActionListener(action);
		buttone.setActionCommand("e");
		straints.gridy=10; straints.gridx=1;
		buttonbra = new Button("      (     ");
		grid.setConstraints(buttonbra, straints);
		add(buttonbra); 
		buttonbra.addActionListener(action);
		buttonbra.setActionCommand("(");
		straints.gridx=2;
		buttonpoint = new Button("     .     ");
		grid.setConstraints(buttonpoint, straints);
		add(buttonpoint); 
		buttonpoint.addActionListener(action);
		buttonpoint.setActionCommand(".");
		straints.gridx=3;
		buttonket = new Button("      )     ");
		grid.setConstraints(buttonket, straints);
		add(buttonket); 
		buttonket.addActionListener(action);
		buttonket.setActionCommand(")");
		straints.gridy=11; straints.gridwidth=3;straints.gridx=0;
		help=new Label("This is a scientific calculator. You may enter the task with buttons or with your keyboard. The calculator is tolerant to most common notations.");
		help2=new Label(" Roots are entered as rational exponents. You may enter sin(x) as s(x), cos(x) as c(x), etc. You can enter Pi as p. Log means the natural logarithm.");
		help3=new Label("The nth power of 10 can be entered as En. This calculator is very fast and exact, but be aware of numerical errors at trigonometric functions.");
		grid.setConstraints(help, straints);
		add(help);
		straints.gridy=12;
		grid.setConstraints(help2, straints);
		add(help2);
		straints.gridy=13;
		grid.setConstraints(help3, straints);
		add(help3);
		straints.gridy=14;
		help4=new Label("by Niklas Götz");
		grid.setConstraints(help4, straints);
		add(help4);
		pack();
		setVisible(true);//Layout done
	}
	class MyWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent event){//enable window-closing
			System.exit(0);
		}
	}
	class Buttonpress implements ActionListener{//next action decided by which button was pressed
		public void actionPerformed (ActionEvent e){
			String cmd = e.getActionCommand();
			if (cmd.equals("+"))
				enter.setText(enter.getText()+"+");//this buttons only add chars
			else if (cmd.equals("-"))
				enter.setText(enter.getText()+"-");
			else if (cmd.equals("*"))
				enter.setText(enter.getText()+"*");
			else if (cmd.equals("/"))
				enter.setText(enter.getText()+"/");
			else if (cmd.equals("^"))
				enter.setText(enter.getText()+"^");
			else if (cmd.equals("1"))
				enter.setText(enter.getText()+"1");
			else if (cmd.equals("2"))
				enter.setText(enter.getText()+"2");
			else if (cmd.equals("3"))
				enter.setText(enter.getText()+"3");
			else if (cmd.equals("4"))
				enter.setText(enter.getText()+"4");
			else if (cmd.equals("5"))
				enter.setText(enter.getText()+"5");
			else if (cmd.equals("6"))
				enter.setText(enter.getText()+"6");
			else if (cmd.equals("7"))
				enter.setText(enter.getText()+"7");
			else if (cmd.equals("8"))
				enter.setText(enter.getText()+"8");
			else if (cmd.equals("9"))
				enter.setText(enter.getText()+"9");
			else if (cmd.equals("0"))
				enter.setText(enter.getText()+"0");
			else if (cmd.equals("s"))
				enter.setText(enter.getText()+"s(");//these are functions, they get brackets, too
			else if (cmd.equals("c"))
				enter.setText(enter.getText()+"c(");
			else if (cmd.equals("t"))
				enter.setText(enter.getText()+"t(");
			else if (cmd.equals("l"))
				enter.setText(enter.getText()+"l(");
			else if (cmd.equals("("))
				enter.setText(enter.getText()+"(");
			else if (cmd.equals("."))
				enter.setText(enter.getText()+".");
			else if (cmd.equals(")"))
				enter.setText(enter.getText()+")");
			else if (cmd.equals("Pi"))
				enter.setText(enter.getText()+"p");
			else if (cmd.equals("e"))
				enter.setText(enter.getText()+"e");
			else if(cmd.equals("erase"))//erase cleans the whole text field
				enter.setText("");
			else if (cmd.equals("sub")&&enter.getText()!=""){//if text is given, it is transferred to save and evaluated
				save.setText("Your last entry:"+enter.getText());
				char [] src=enter.getText().toCharArray();
				enter.setText(eval(shunting(src)));


			}
		}
	}

	public static String[] shunting (char [] src1){//we evaluate the entry by ourselves; this is much more secure than the JavaScript-solution. 
		//We need to transfer the human notation into RPN with the shunting-yard algorithm
		int length=src1.length;
		String [] errorstring=new String [1]; //tells eval that something went wrong
		errorstring[0]="";
		Stack<String> stack=new Stack<String>();
		Stack<String> output=new Stack<String>();
		int open=0, close = 0,fcount=0;
		for(int i=0; i<length;i++){//check if there are no forbidden chars
			if (src1[i]!='0'&&src1[i]!='1'&&src1[i]!='2'&&src1[i]!='3'&&src1[i]!='4'&&src1[i]!='5'&&src1[i]!='6'&&src1[i]!='7'&&src1[i]!='8'&&src1[i]!='9'&&
					src1[i]!='+'&&src1[i]!='-'&&src1[i]!='*'&&src1[i]!='/'&&src1[i]!='('&&src1[i]!=')'&&src1[i]!='.'&&src1[i]!='E'&&src1[i]!='^'&&src1[i]!='s'
					&&src1[i]!='c'&&src1[i]!='t'&&src1[i]!='l'&&src1[i]!='p'&&src1[i]!='e')
				return errorstring;
			if(src1[i]=='(')//check if there are matching brackets
				open++;
			if(src1[i]==')')
				close++;
			if(src1[i]=='s'||src1[i]=='c'||src1[i]=='t'||src1[i]=='l')//save number of functions for handling of unary-minus
				fcount++;
		}
		if(open!=close)
			return errorstring;
		char [] src=new char[length+open+5*fcount+2];//new char-array with more space for changes
		for(int i=0; i<length; i++){
			src[i]=src1[i];
		}
		for(int i=0; i<src.length-1; i++){
			if(src[i]==')'&&src[i+1]=='('){//set a * between ) and ( (implicite *)
				for(int z=src.length-1; z>i+1;z--){
					src[z]=src[z-1];

				}
				src[i+1]='*';
			}
		}

		for(int i=0; i<src.length-1; i++){//transfer -s(...) into (-1)*s(..) (because we cannot put it into the double value if there is not yet an existing one)
			if((src[i]=='-'&&(src[i+1]=='s'||src[i+1]=='c'||src[i+1]=='t'||src[i+1]=='l'))&&
					((i==0)||(src[i]=='-'&&(src[i-1]=='+'||src[i-1]=='-'||src[i-1]=='*'||src[i-1]=='/'||src[i-1]=='('||src[i-1]=='^')))){
				char buffer1=src[i];
				for(int z=src.length-1; z>i+4;z--){
					src[z]=src[z-4];
				}
				src[i]='('; src[i+1]=buffer1; src[i+2]='1'; src[i+3]=')'; src[i+4]='*';

			}
		}

		for(int i=0; i<src.length-1; i++){// kill unary +
			if(src[i]=='+'&&((i==0)||src[i-1]=='-'||src[i-1]=='+'||src[i-1]=='*'||src[i-1]=='/'||src[i-1]=='^'||src[i-1]=='(')){
				for(int z=i; z<src.length-1; z++){
					src[z]=src[z+1];
				}
			}
		}
		String save;
		System.out.println("");
		for(int i=0; i<src.length;i++){
			boolean ignore=false;  //transform the chars into double values if possible and add a - if they are intended to be negative
			if((src[i]=='0'||src[i]=='1'||src[i]=='2'||src[i]=='3'||src[i]=='4'||src[i]=='5'||src[i]=='6'||src[i]=='7'||src[i]=='8'||src[i]=='9')||src[i]=='p'||src[i]=='e'||
					(src[i]=='-'&&(i==0))||(src[i]=='-'&&(src[i-1]=='+'||src[i-1]=='-'||src[i-1]=='*'||src[i-1]=='/'||src[i-1]=='('||src[i-1]=='^'))){
				String saver="";
				if(src[i]=='p'){
					saver=""+Double.toString(Math.PI);
				}else if(src[i]=='e'){
					saver=""+Double.toString(Math.E);
				}else{
					saver=""+src[i];
				}
				for(int k=i+1; k<src.length; k++){
					if(src[k]=='p'||src[k]=='e'||src[k]=='0'||src[k]=='1'||src[k]=='2'||src[k]=='3'||src[k]=='4'||src[k]=='5'||src[k]=='6'||src[k]=='7'||src[k]=='8'||src[k]=='9'||src[k]==' '||src[k]=='.'||src[k]=='E'){
						if(src[k]=='p'){
							saver=saver+Double.toString(Math.PI);
						}else if(src[k]=='e'){
							saver=saver+Double.toString(Math.E);
						}else{
							saver=saver+src[k];}
						i=i+1;
					}else{
						if(src[i]=='-')
							ignore=true;
						break;

					}
				}
				output.push(saver);
			}


			if(src[i]=='/'){ //the following part is the shunting-yard-algorithm. You may read literature about this to understand it if you don't alreadey do so

				while(!stack.empty()&&((save=stack.peek())=="*"||save=="^")){
					output.push(stack.pop());}	
				stack.push(""+'/');
			}
			if(src[i]=='*'){
				while(!stack.empty()&&((save=stack.peek())=="/"||save=="^")){
					output.push(stack.pop());}

				stack.push(""+'*');
			}

			if(src[i]=='(')
				stack.push(""+'(');
			if(src[i]==')'){
				while(!stack.empty()&&(save=stack.pop())!="(")
					output.push(save);
				if(!stack.empty()&&stack.peek()=="(")
					stack.pop();
				if(!stack.empty()&&(stack.peek()=="s"||stack.peek()=="c"||stack.peek()=="t"||stack.peek()=="l")){
					output.push(stack.pop());
				}
			}
			if(src[i]=='+'){
				while(!stack.empty()&&((save=stack.peek())=="/"||save=="*"||save=="-"||save=="^")){ 
					output.push(stack.pop());}	
				stack.push(""+'+');
			}
			if(src[i]=='-'&&ignore==false){
				while(!stack.empty()&&((save=stack.peek())=="/"||save=="*"||save=="+"||save=="^")){
					output.push(stack.pop());}	
				stack.push(""+'-');
			}
			if(src[i]=='^'){ //has maximum precidence of all allowed operators
				stack.push(""+'^');
			}
			if(src[i]=='s')
				stack.push(""+'s');
			if(src[i]=='c')
				stack.push(""+'c');
			if(src[i]=='t')
				stack.push(""+'t');
			if(src[i]=='l')
				stack.push(""+'l');

		}
		String save2;
		while(!stack.empty()&&((save2=stack.pop())=="+"||save2=="-"||save2=="/"||save2=="*"||save2=="^"||save2=="s"||save2=="c"||save2=="t"||save2=="l")){
			output.push(save2);
		}
		String []stacker=new String [output.size()]; //put the result into a string array
		int i1=0;
		while(!output.empty()){
			stacker[i1]=output.pop();
			i1=i1+1;
		}
		return stacker;
	}
	public static String eval (String []term){//evaluates mathematical tasks which are written in RPN
		if(term.length==0||term[0]==""){ //checks if errorstring was given
			return "Error occured";		
		}
		Stack<Double>calc=new Stack<Double>();
		for(int i=term.length-1; i>=0;i--){
			if(term[i]!="+"&&term[i]!="-"&&term[i]!="*"&&term[i]!="/"&&term[i]!="^"&&term[i]!="s"&&term[i]!="c"&&term[i]!="t"&&term[i]!="l"){
				{calc.push( Double.parseDouble(term[i]));}; //transforms the Strings into doubles
			}
			if(term[i]=="+"){ //adds the top of the stack
				double a=calc.pop();
				double b= calc.pop();
				calc.push(a+b);
			}
			if(term[i]=="-"){//substracts the top of the stack
				double a=calc.pop();
				double b= calc.pop();
				calc.push((b-a));
			}
			if(term[i]=="*"){//...
				double a=calc.pop();
				double b= calc.pop();
				calc.push(a*b);
			}
			if(term[i]=="/"){
				double a=calc.pop();
				double b= calc.pop();
				calc.push(b/a);
			}
			if(term[i]=="^"){
				double a=calc.pop();
				double b= calc.pop();
				calc.push(Math.pow(b, a));
			}
			if(term[i]=="s"){//uses the functions
				calc.push(Math.sin(calc.pop()));
			}
			if(term[i]=="c"){
				calc.push(Math.cos(calc.pop()));
			}
			if(term[i]=="t"){
				calc.push(Math.tan(calc.pop()));
			}
			if(term[i]=="l"){
				calc.push(Math.log(calc.pop()));
			}
		}
		return String.valueOf(calc.pop());//the string-form of our double value is given back



	}
	public static void main(String[]args){
		SciCalc c=new SciCalc(900,900);

	}
}
//by Niklas Götz