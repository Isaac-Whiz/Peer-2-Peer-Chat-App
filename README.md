<p align="center">  
  <img src="https://github.com/Isaac-Whiz/Peer-2-Peer-Chat-App/assets/95527627/de92e3f9-74f2-4644-859e-7e5d1e137d62" alt="Shoppe Application" style="border-radius:50px">
</p>

# Peer-2-Peer Chat

A web powered one to one live chat application, enabling the sending and receiving of instant messages between two persons.


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

Open a new tab and type `http://localhost:27017` and voila, you have successfully configured and run the chat app. Next steps include logging in and starting to chat.

And repeat
    

    until finished

End with an example of getting some data out of the system or using it
for a little demo

## Running the tests

Explain how to run the automated tests for this system

### Sample Tests

Explain what these tests test and why

    Give an example

### Style test

Checks if the best practices and the right coding style has been used.

    Give an example

## Deployment

Add additional notes to deploy this on a live system

## Built With

  - [Contributor Covenant](https://www.contributor-covenant.org/) - Used
    for the Code of Conduct
  - [Creative Commons](https://creativecommons.org/) - Used to choose
    the license

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code
of conduct, and the process for submitting pull requests to us.

## Versioning

We use [Semantic Versioning](http://semver.org/) for versioning. For the versions
available, see the [tags on this
repository](https://github.com/PurpleBooth/a-good-readme-template/tags).

## Authors

  - **Billie Thompson** - *Provided README Template* -
    [PurpleBooth](https://github.com/PurpleBooth)

See also the list of
[contributors](https://github.com/PurpleBooth/a-good-readme-template/contributors)
who participated in this project.

## License

This project is licensed under the [CC0 1.0 Universal](LICENSE.md)
Creative Commons License - see the [LICENSE.md](LICENSE.md) file for
details

## Acknowledgments

  - Hat tip to anyone whose code is used
  - Inspiration
  - etc
