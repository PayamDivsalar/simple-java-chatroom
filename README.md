# Java Chatroom Application

This is a Java-based chatroom application built using multithreading, client-server architecture, and socket programming. The application allows multiple clients to connect to a server and exchange messages in real-time.

## Features

- **Multithreaded Server**: Supports multiple clients connecting and communicating simultaneously.
- **Client-Server Architecture**: Centralized server manages all client connections and message broadcasting.
- **Socket Programming**: Uses Java sockets for network communication between clients and the server.

## How It Works

1. **Server**: The server listens for incoming client connections and creates a new thread for each client to handle communication.
2. **Client**: Clients connect to the server and can send and receive messages from the chatroom.
