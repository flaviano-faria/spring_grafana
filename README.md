Overview:
  - This project demonstrates a sample Spring Application that generates logs and exports this to loki.
    Moreover this logs can be filtered in Grafana platform.

     Steps to test this:
    - Clone thre repository
    - Run docker-compose.yml file with docker-compose up command.
    - Run application as spring boot application in your IDE.
    - Access the https://localhost:3000 url to view Grafana features <br/>
   
      Configure connection with loki:
      ![image](https://github.com/user-attachments/assets/2aa28d9e-8f05-467f-9daa-0a47f1879f29)

   
    <b>Query Showcase:</b> <br/>
    message logged: <br/>
      {
      	"id":13456,
      	"code":"A4568UBT898989",
      	"message":"success"
      }
  
    Getting "code" field from log where code is not blank: <br/>
    
    {level="INFO", app="spring_grafana"} | regexp \`"code":"(?P\<code\>\w+)"\` | line_format \`{{.code}}\` |~ \`\w+\`

    ![image](https://github.com/user-attachments/assets/0cc13d4b-1f99-477b-aa61-5a2a7dcd67dc)

    Using query builder: <br/>

    ![image](https://github.com/user-attachments/assets/b7debe53-aad1-4e35-9595-86571def2367)

   Getting total field from each transaction:

   ![image](https://github.com/user-attachments/assets/a67b8502-9862-4074-881d-48b79b828835)


    {level="INFO"} | regexp \`"total":(?P<total>\d+.\d+)\` | line_format \`{{.total}}\` |~ `\d+.\d+\`
    
    Google re2 reference: https://github.com/google/re2/wiki/syntax
