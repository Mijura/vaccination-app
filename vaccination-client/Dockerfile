# Create image based on the official Node 17 image from dockerhub
FROM node:17

# Change directory so that our commands run inside this new directory
WORKDIR /app

# Copy dependency definitions
COPY package*.json /app/

# Install dependencies
RUN npm install

# Get all the code needed to run the app
COPY . /app/

ARG CLIENT_PORT

# Expose the port the app runs in
EXPOSE ${CLIENT_PORT} 

# Serve the app
CMD ["npm", "start"]