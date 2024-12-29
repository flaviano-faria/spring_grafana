Overview:
  - This project demonstrates a sample Spring Application that generates logs and exports this to loki.
    Moreover this logs can be filtered in Grafana platform.

     Steps to test this:
    - Clone thre repository
    - Run docker-compose.yml file with docker-compose up command.
    - Run application as spring boot application in your IDE.
    - Access the https://localhost:3000 url to view Grafana features
   
    Query Showcase:
    message logged:
      {
      	"id":13456,
      	"code":"A4568UBT898989",
      	"message":"success"
      }
  
    Getting "code" field from log where code is not blank:
    {level="INFO"} | regexp `"code":"(?P<code>\w+)"` | line_format `{{.code}}` |~ `\w+`

    ![image](https://github.com/user-attachments/assets/0cc13d4b-1f99-477b-aa61-5a2a7dcd67dc)

