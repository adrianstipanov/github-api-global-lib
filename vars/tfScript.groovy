def call(Object terraformObject, Closure scriptClosure) {
  return {
    echo "$this"
    terraformObject.context = this
    scriptClosure.delegate = terraformObject
    scriptClosure.resolveStrategy = Closure.DELEGATE_FIRST
    scriptClosure()
  }()
}
