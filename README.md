<p align="center">  
  <img src="https://github.com/Isaac-Whiz/Peer-2-Peer-Chat-App/assets/95527627/de92e3f9-74f2-4644-859e-7e5d1e137d62" alt="Shoppe Application" style="border-radius:50px">
</p>

# Peer-2-Peer Chat

A web powered one to one live chat application, enabling the sending and receiving of instant messages between two persons.
This application embraces the usage of Web Sockets to enable realtime communication between users on the grid.

## Getting Started 💨

These instructions will give you a copy of the project up and running on
your local machine for development and testing purposes.

### Prerequisites ⚒

Requirements 
- [Docker](https://www.docker.com)
- [Mongo DB docker image](https://hub.docker.com/_/mongo/)
- [Mongo Express docker image](https://hub.docker.com/_/mongo-express/)
- Browser (Chrome, Edge etc)
- Code editor (Notepad++, VScode etc)

## Ping me 📧 

Ssekajja Wavamuno Isaac - On X [@IsaacWavamuno](https://twitter.com/Isaac_Whiz) - Mail ssekajjawavamuno@gmail.com

### Installing ⏬

Please carefully follow the below step to have the application up and running.

After downloading and installing docker client on your environment (computer), browse to the docker registry [(docker hub)](https://www.docker.com) and download the [Mongo DB](https://hub.docker.com/_/mongo/) and [Mongo Express images](https://hub.docker.com/_/mongo-express/).

<i>Note: Your downloaded docker images will automatically appear under the images in your docker client.</i>

Copy and paste the below code as is and paste it in your favourable code editor (Notepad++/VScode) or any other.

   <code>
services:
  mongodb:
    image: mongo
    container_name: mongo_db
    ports:
      - 27017:27017
    volumes:
      - mongo:/data
    environment:
      - MONGO_INITDB_ROOT_USERNAME=whiz
      - MONGO_INITDB_ROOT_PASSWORD=isaacwhiz
  mongo-express:
    image: mongo-express
    container_name: mongo_express
    restart: unless-stopped
    ports:
      - 8081:8081
    environment:
      - ME_CONFIG_MONGODB_ADMINUSERNAME=isaac
      - ME_CONFIG_MONGODB_ADMINPASSWORD=isaacwhiz
      - ME_CONFIG_MONGODB_SERVER=mongodb
volumes:
  mongo: {}
   </code>

Please follow the same identation as this is a `.yml` file

Save the above file as `docker-compose` with a `.yml` or `.yaml` file extention.

Use the terminal (command line interface), browse to the location where you stored the file and type `docker-compose up`. This command starts the `mongo_db` and `mongo_express` running on port `27017` and `8081` respectively.

Then open the browser and enter `http://localhost:8081` then on the dashboard click `add database` button and add `chat_app` database.

Open a new tab and type `http://localhost:8088` and voila, you have successfully configured and run the chat app. Next steps include logging in and starting to chat.

## Shots of the application 🖼

<p align="center">  
  <img src="https://github.com/Isaac-Whiz/Peer-2-Peer-Chat-App/assets/95527627/d4ed2d24-2fa5-4eed-9f0d-670a822f227c" alt="Login" style="border-radius:40px">
</p>
<p align="center">  
  <img src="https://github.com/Isaac-Whiz/Peer-2-Peer-Chat-App/assets/95527627/037d2115-3288-41f9-bebe-2774d77e63f0" alt="Chat" style="border-radius:40px">
</p>

## Legality ⚖

[GNU General Public License](https://github.com/Isaac-Whiz/Peer-2-Peer-Chat-App#)

## Built With 🏗 🛠

  - [Java](https://www.java.com/en/download/) - Used to craft the backend of the application (API) to recept and serve user requests.
  
  - [Javascript](https://developer.mozilla.org/en-US/docs/Web/javascript) - Used to make the api calls from the frontend to the back end of the application and also modification of the frontend due to the made request and respsctive reply.
    
  - [HTML](https://html.com/) - Used to create the graphical user interface to the user, simply enabling the logging in and initiating a conversation.

  - [CSS](https://developer.mozilla.org/en-US/docs/Web/CSS) - Used to beautify the mark-up of the frontend.

  - [Docker](https://www.docker.com/) - Used to create environment and housing the Mongo DB and Mongo Express images.

## Contributing ⤴

Adding to this project is highly welcomed and appricated from anyone. The user can add any feature desired to the project through
- Forking the repository
- Cloning the repository 
- Create a branch named your proposed feature
- Create the beautifull feature
- Push your branch to remote <i>main</i> branch
Thank you for making this project better.

## Acknowledgments 🧠

  - [Ali Bouli](https://aliboucoding.com/)
