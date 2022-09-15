interface FiguraGeometrica
{
public String getNomeFigura();
public int getArea();
public int getPerimetro();
}

class Quadrado implements FiguraGeometrica {

private int lado;

public int getLado() {
return lado;
}

public void setLado(int lado) {
this.lado = lado;
}

@Override
public int getArea() {
int area = 0;
area = lado * lado;

return area;
}

@Override

public int getPerimetro() {
int perimetro = 0;

perimetro = lado * 4;
return perimetro;
}

@Override
public String getNomeFigura() {
return "quadrado";
}
}

class Triangulo implements FiguraGeometrica {

private int base;
private int altura;
private int ladoA;
private int ladoB;
private int ladoC;

public int getAltura() {
return altura;
}

public void setAltura(int altura) {
this.altura = altura;
}

public int getBase() {
return base;

}

public void setBase(int base) {
this.base = base;
}

public int getLadoA() {
return ladoA;
}

public void setLadoA(int ladoA) {
this.ladoA = ladoA;
}

public int getLadoB() {
return ladoB;
}

public void setLadoB(int ladoB) {
this.ladoB = ladoB;
}

public int getLadoC() {
return ladoC;
}

public void setLadoC(int ladoC) {
this.ladoC = ladoC;
}

@Override

public String getNomeFigura() {
return "Triangulo";
}

@Override
public int getArea() {
int area = 0;
area = (base * altura) / 2;
return area;
}

@Override
public int getPerimetro() {
int perimetro = 0;
perimetro = ladoA + ladoB + ladoC;

return perimetro;
}
}

public class MyClass {
public static void main(String args[]) {
Triangulo fig1 = new Triangulo(); //obj do triangulo

FiguraGeometrica trig = fig1; // upcast para Leitor
fig1.setLadoA(3);
fig1.setLadoB(3);
fig1.setLadoC(3);
fig1.setBase(8);
fig1.setAltura(6);

Quadrado fig2 = new Quadrado(); 

fig2.setLado(4);

System.out.println("Perímetro do quadrado: "+ fig2.getPerimetro() );
System.out.println("Área do quadrado: "+ fig2.getArea() );
System.out.println("Perímetro do triangulo: " + trig.getPerimetro());
System.out.println("Área do Triangulo: "+ fig1.getArea() );

}
}