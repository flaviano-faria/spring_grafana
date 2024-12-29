Overview:
  - This project demonstrates a sample Spring Application that generates logs and exports this to loki.
    Moreover this logs can be filtered in Grafana platform.

     Steps to test this:
    - Clone thre repository
    - Run docker-compose.yml file with docker-compose up command.
    - Run application as spring boot application in your IDE.
    - Access the https://localhost:3000 url to view Grafana features
   
    <b>Query Showcase:</b> <br/>
    message logged: <br/>
      {
      	"id":13456,
      	"code":"A4568UBT898989",
      	"message":"success"
      }
  
    Getting "code" field from log where code is not blank: <br/>
    {level="INFO"} | regexp `"code":"(?P<code>\w+)"` | line_format `{{.code}}` |~ `\w+`<br/>

    ![image](https://github.com/user-attachments/assets/0cc13d4b-1f99-477b-aa61-5a2a7dcd67dc)

    Using query builder: <br/>

    ![image](https://github.com/user-attachments/assets/b7debe53-aad1-4e35-9595-86571def2367)


