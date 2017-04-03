Proceso sin_titulo
	
	Escribir ["Tres numeros que sumados y multiplicados den el mismo resultado"];
	
	Repetir
		
		Escribir "Ingrese primer nœmero";
		Leer A;
		Escribir "Ingrese segundo nœmero";
		Leer B;
		Escribir "Ingrese tercer nœmero";
		Leer C;
		
		suma <- A + B + C;
		multiplicacion <- A * B * C;
		
		si suma=6 y multiplicacion=6 entonces
			escribir "CORRECTO";
		Sino
			escribir "INCORRECTO, IntŽntalo nuevamente";
		FinSi
		
	Hasta Que suma=6 y multiplicacion=6;
	
FinProceso
