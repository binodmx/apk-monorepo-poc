import ballerina/http;

listener http:Listener httpListner = new (8080);

service / on httpListner {
    resource function get helloworld() returns string {
        return "Hello, World!";
    }
}

public function intAdd(int a, int b) returns (int) {
    return a + b;
}
