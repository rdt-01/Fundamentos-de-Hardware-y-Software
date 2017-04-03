Proceso sin_titulo
	
	rep<-2;
	
	Repetir
		Escribir "Ingrese numero 1";
		Leer num1;
		Escribir "Ingrese numero 2";
		Leer num2;
		
		Si num1>num2 Entonces
			Escribir "numero 1 es mayor que numero 2"; 
		Sino
			Si num1=num2 Entonces
				Escribir "numero 1 es igual a numero 2";
			Sino
				Escribir "numero 2 es mayor a numero 1";
			FinSi
		FinSi
	Hasta Que rep=3
	
FinProceso
