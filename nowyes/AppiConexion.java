package nowyes;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

public class AppiConexion {
    public static void main(String[] args) {


    }

            Cambio usdClp() {
                Scanner keyboard = null;
                try {
                    keyboard = new Scanner(System.in);
                    double change = keyboard.nextDouble();

                    String link = "https://v6.exchangerate-api.com/v6/b5d31040d9647eec1d34ed58/pair/USD/CLP/" + change;

                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(link))
                            .build();


                    HttpResponse<String> response = null;
                    try {
                        response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (NumberFormatException e) {
                        out.println(e.getMessage());
                        out.println("ingrese una cantidad");
                    }

                    JsonParser jp = new JsonParser();
                    JsonElement root = jp.parse(response.body());
                    JsonObject jsonobj = root.getAsJsonObject();

                    String req_result = jsonobj.get("conversion_result").getAsString();
                    out.println("son");
                    out.println(req_result);
                    out.println("pesos chilenos");
                } catch (InputMismatchException e) {
                    out.println("Ingrese un número");
                    keyboard.next();
                }
                return null;
            }

            Cambio clpUsd(){
        Scanner keyboard = new Scanner(System.in);
            try {


                double change1 = keyboard.nextDouble();
                String link = "https://v6.exchangerate-api.com/v6/b5d31040d9647eec1d34ed58/pair/CLP/USD/" + change1;

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(link))
                        .build();


                HttpResponse<String> response = null;
                try {
                    response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (NumberFormatException e) {
                    out.println("ingrese una cantidad válida");
                }

                JsonParser jp = new JsonParser();
                JsonElement root = jp.parse(response.body());
                JsonObject jsonobj = root.getAsJsonObject();

                String req_result = jsonobj.get("conversion_result").getAsString();
                out.println("son");
                out.println(req_result);
                out.println("Dólares");
            }catch (InputMismatchException e) {
                out.println("Ingrese un número");
                keyboard.next();

            }

                return null;
    }

            Cambio usdCop(){
        Scanner keyboard = new Scanner(System.in);
        try {


            double change2 = keyboard.nextDouble();
            String link = "https://v6.exchangerate-api.com/v6/b5d31040d9647eec1d34ed58/pair/USD/COP/" + change2;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(link))
                    .build();


            HttpResponse<String> response = null;
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException e) {
                out.println("ingrese una cantidad");
            }

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(response.body());
            JsonObject jsonobj = root.getAsJsonObject();

            String req_result = jsonobj.get("conversion_result").getAsString();
            out.println("son");
            out.println(req_result);
            out.println("pesos colombianos");
        }catch (InputMismatchException e) {
            out.println("Ingrese un número");
            keyboard.next();
        }
            return null;
    }

            Cambio copUsd(){
        Scanner keyboard = new Scanner(System.in);
        try {
            double change3 = keyboard.nextDouble();
            String link = "https://v6.exchangerate-api.com/v6/b5d31040d9647eec1d34ed58/pair/COP/USD/" + change3;


            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(link))
                    .build();


            HttpResponse<String> response = null;
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException e) {
                out.println("ingrese una cantidad");
            }

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(response.body());
            JsonObject jsonobj = root.getAsJsonObject();

            String req_result = jsonobj.get("conversion_result").getAsString();
            out.println("son");
            out.println(req_result);
            out.println("dólares");
        }
        catch (InputMismatchException e) {
            out.println("Ingrese un número");
            keyboard.next();

        }
        return null;
    }

            Cambio usdArs(){
        Scanner keyboard = new Scanner(System.in);
            try {


                double change4 = keyboard.nextDouble();
                String link = "https://v6.exchangerate-api.com/v6/b5d31040d9647eec1d34ed58/pair/USD/ARS/" + change4;

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(link))
                        .build();


                HttpResponse<String> response = null;
                try {
                    response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (NumberFormatException e) {
                    out.println("ingrese una cantidad");
                }

                JsonParser jp = new JsonParser();
                JsonElement root = jp.parse(response.body());
                JsonObject jsonobj = root.getAsJsonObject();

                String req_result = jsonobj.get("conversion_result").getAsString();
                out.println("son");
                out.println(req_result);
                out.println("pesos argentinos");
                ;
            }    catch (InputMismatchException e) {
                out.println("Ingrese un número");
                keyboard.next();
            }

                return null;
    }

            Cambio arsUsd(){
        Scanner keyboard = new Scanner(System.in);
        try {


            double change5 = keyboard.nextDouble();
            String link = "https://v6.exchangerate-api.com/v6/b5d31040d9647eec1d34ed58/pair/ARS/USD/" + change5;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(link))
                    .build();


            HttpResponse<String> response = null;
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (NumberFormatException e) {
                out.println("ingrese una cantidad válida");
            }

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(response.body());
            JsonObject jsonobj = root.getAsJsonObject();

            String req_result = jsonobj.get("conversion_result").getAsString();
            out.println("son");
            out.println(req_result);
            out.println("dólares");
        }catch (InputMismatchException e) {
            out.println("Ingrese un número");
            keyboard.next();
        }
            return null;
    }
    }

