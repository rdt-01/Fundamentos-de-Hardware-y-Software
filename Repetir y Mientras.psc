Proceso sin_titulo
	
	Escribir ["Tres numeros que sumados y multiplicados den el mismo resultado"];
	
	Repetir
		
		Escribir "Ingrese primer n�mero";
		Leer A;
		Escribir "Ingrese segundo n�mero";
		Leer B;
		Escribir "Ingrese tercer n�mero";
		Leer C;
		
		suma <- A + B + C;
		multiplicacion <- A * B * C;
		
		si suma=6 y multiplicacion=6 entonces
			escribir "CORRECTO";
		Sino
			escribir "INCORRECTO, Int�ntalo nuevamente";
		FinSi
		
	Hasta Que suma=6 y multiplicacion=6;
	
FinProceso
