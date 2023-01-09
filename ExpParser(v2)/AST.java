abstract class Exp {
public abstract Object accept(Visitor v);
}

class Plus extends Exp{
Exp e1,e2;
	
public Plus(Exp a, Exp b){		
e1=a;
e2=b;	
}

public String toString(){
return "Plus(" +e1+","+e2+")";
}

public Object accept(Visitor v) {
return v.visit(this);
}	
}

class Minus extends Exp{
Exp e1,e2;
	
public Minus(Exp a, Exp b){		
e1=a;
e2=b;	
}

public String toString(){
return "Minus(" +e1+","+e2+")";
}

public Object accept(Visitor v) {
return v.visit(this);
}	
}

class Merge extends Exp{
Exp e1,e2;
	
public Merge(Exp a, Exp b){
e1=a;
e2=b;	
}

public String toString(){
return "Merge(" +e1+","+e2+")";
}

public Object accept(Visitor v) {
return v.visit(this);
}	
}

class Power extends Exp{
Exp e1,e2;
	
public Power(Exp a, Exp b){		
e1=a;
e2=b;	
}

public String toString(){
return "Power(" +e1+","+e2+")";
}

public Object accept(Visitor v) {
return v.visit(this);
}	
}

class Numx extends Exp{
String n;
	
public Numx(String a){		
n=a;	
}

public String toString(){
return "Numx(" +n+")";
}
	
public Object accept(Visitor v) {
return v.visit(this);
}	
}

class Num extends Exp{
int n;
	
public Num(int a){
n=a;		
}

public String toString(){
return "Num(" +n+")";
}
	
public Object accept(Visitor v) {
return v.visit(this);
}
}

class ID extends Exp{
String n;
	
public ID(String a){
n=a;	
}
	
public String toString(){
return "ID(" +n+")";
}
	
public Object accept(Visitor v) {
return v.visit(this);
}	
}


