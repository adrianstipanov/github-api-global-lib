def call(Object terraformObject, Closure scriptClosure) {
  return {
    terraformObject.context = this
    scriptClosure.delegate = terraformObject
    scriptClosure.resolveStrategy = Closure.DELEGATE_FIRST
    scriptClosure()
  }()
}
