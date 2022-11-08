def call(Object terraformObject, Closure scriptClosure) {
  return {
    echo "$this"
    sh 'printenv | sort'
    terraformObject.context = this
    scriptClosure.delegate = terraformObject
    scriptClosure.resolveStrategy = Closure.DELEGATE_FIRST
    scriptClosure()
  }()
}
