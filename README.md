# Taller práctico de Disponibilidad y Desempeño


#### 1.	Problema
Suponga que en la empresa en la que trabaja han contratado un Equipo de Hackers para probar la estabilidad de los servidores, y debido a esto le han pedido montar el código de un microservicio en otra maquina con el fin de ofrecer el servicio de forma continua a los clientes
#### 2. Prototipo
![image](https://user-images.githubusercontent.com/42522754/69918057-5af73d80-143b-11ea-8ee0-e83731741daa.png)
#### 3. Depliegue la solución en AWS en EC2
![image](https://user-images.githubusercontent.com/42522754/69920401-9d2d7880-1455-11ea-8391-096807fbef87.png)

![image](https://user-images.githubusercontent.com/42522754/69920436-fac1c500-1455-11ea-961d-f0e8fe2b9ffa.png)

#### 4. Configure la máquina para que inicie los servicios una vez se reinicia el servidor

para la automatizacion del servicio use la herramienta de linux Crontab https://geekytheory.com/programar-tareas-en-linux-usando-crontab

para esto seguir estos dos pasos
1. escribir crontab -e

#
![image](https://user-images.githubusercontent.com/42522754/69924390-23a78180-1479-11ea-8a28-d9a86b91e774.png)

2. escribir la orden a automatizar y guardarla (si desea ver que el guardado fue exitoso escriba crontab -l)
#
![image](https://user-images.githubusercontent.com/42522754/69924373-0d99c100-1479-11ea-8bc1-28355d68b515.png)

#### 5. Cree un AMI a partir de esta máquina.

![image](https://user-images.githubusercontent.com/42522754/69924630-6a49ab80-147a-11ea-925f-677831121e24.png)
![image](https://user-images.githubusercontent.com/42522754/69924729-e9d77a80-147a-11ea-955c-d3a66376e08c.png)
![image](https://user-images.githubusercontent.com/42522754/69924696-b268ce00-147a-11ea-8e5b-ceea3d3be07d.png)

#### 6.Despliegue la solución en un grupo de autoescalamiento.
- para este paso seguimos las indicaciones del tutorial de este link siguiendo algunas excepciones las cuales vamos a mostrar
https://docs.aws.amazon.com/es_es/autoscaling/ec2/userguide/GettingStartedTutorial.html#gs-create-lt

1. en el paso 7 de crear nuestra plantilla de lanzamiento escojemos nuestra imagen

![image](https://user-images.githubusercontent.com/42522754/69927539-4d1ada00-1486-11ea-9f13-0acbbce1d3d1.png)

2. una vez terminado el grupo de autoescalamiento procedemos a hacer lo siguiente

-  editar el grupo de autoescalamiento
![image](https://user-images.githubusercontent.com/42522754/69928695-72a9e280-148a-11ea-9922-aa77a59d66ba.png)

-cambiar a los valores de la imagen para poder aligerar costos con 0 instancias y para ver el escalamiento con las 2 instancias

![image](https://user-images.githubusercontent.com/42522754/69928746-9c630980-148a-11ea-8f4c-be20dcf10f76.png)

