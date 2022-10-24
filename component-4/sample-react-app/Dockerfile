# pull official base image
FROM node:14-alpine

# set working directory
WORKDIR /sample-react-app

# install app dependencies
COPY package.json ./
RUN npm install --silent

# add app
COPY . ./

# expose port
EXPOSE 3000

# start app
CMD ["npm", "start"]
