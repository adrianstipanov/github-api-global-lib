class Terraform {
    public Object context

    def void init(){
        return "Initializing..."
    }
    
    def void printBuildNumber() {
        return context.env.BUILD_NUMBER
    }
}
