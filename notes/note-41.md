# PLS Fall 2024 Note 41

## Review for final

The final is cumulative.

* Sources relevant to study
  * Readings
    * Notes: All (but no monads)
    * Readings: Slides 0, 1, 1a, 2, 3, 3a, 4, 5
    * Assignments: a1 - a5
    * Your personal notes
    * This review sheet
* Language specification
    * Lexical analysis
      * Lexer/scanner
      * Tokens
      * Lexemes
      * Token rules
      * Skip rules
      * Longest-first match rule
      * Regex
    * Syntactic analysis
      * Parser
      * Start symbol
      * Terminals
      * Non-terminals
      * BNF notation
      * Mapping rules to classes and attributes/instance variables in Java
      * Naming LHS non-terminals to disambiguate
      * Naming RHS terminals and non-terminals to disambiguate
      * Repeating rules and optional separator
      * Parse tree/abstract parse tree/abstract syntax tree
      * Capturing and not capturing tokens
    * Semantic analysis
      * `rep`
        * Able to implement a polymorphic method across alternatives
        * `$run` method and the class for the start symbol
        * Able to read and write small snippets of code to walk a parse tree to
          accomplish some goal
* Concepts
  * Side effects
  * Evaluation order
  * Evaluation strategy
    * Strict (e.g., C)
    * Non-strict (e.g., Haskell)
      * Short circuit (e.g., boolean expression in C)
  * Calling conventions
    * By value
    * By reference
    * By name
    * By need
    * By copy-in-copy-out
  * Currying
    * `.proc(x, y) +(x, y) (3, 4)` => `.proc(x) .proc(y) +(x, y) (3) (4)`
  * Closures
  * Thunks
  * Scope
    * Static
    * Dynamic
  * Free vs bound variables
  * Aliasing (page 3a.45)
  * Types
    * Statically- vs dynamically typed
    * Strongly vs weakly typed
    * Type notation `[ t1, t2, ..., t3 => t ]`
    * Type errors
    * Type inference vs type declaration
    * Function definition vs declaration
  * First-class functions
  * Classes
    * Class vs object
    * First-class classes
    * Static vs non-static members (`static` vs `field`)
    * Methods
    * Inheritance
    * Dynamic dispatch
    * Polymorphism
      * Subtyping
      * Parametric
      * Ad-hoc
* The V* language
  * `Env` - `EnvNode`, `EnvNull`, `Val`, `IntVal`
  * V0
    * Basic expressions: `LitExp`, `VarExp`, `PrimappExp`
    * Pretty print them with toString()
  * V1
    * Use `Env` to evaluate basic expressions
  * V2
    * `IfExp`
    * Truthiness of `Val`s.
  * V3
    * `LetExp`
  * V4
    * `ProcExp`, `AppExp`, `LetExp`-`AppExp`-identity, `SeqExp`
  * V5
    * `LetrecExp`
  * V6
    * `DefineProg` and the top-level environment
  * SET
    * `SetExp`
    * Side effects, mutation
    * Reference
    * Modify a captured environment (page 3a.4)
    * `ValRef` with `deref` and `setref` methods
  * REF
    * Shared reference
    * Pass by value or by reference depending on effective argument
      * L-value, R-value (page 3a.18)
  * NAME
    * Thunk, `ThunkRef`
    * Different parameter passing strategies depending on effective argument
      * New reference
      * Shared reference
      * Thunk
  * NEED
    * Memoization
    * `ThunkRef`
  * CICO
  * MACRO
    * Dynamic scoping
  * TYPE0
    * Based on SET
    * Static, strongly typed
    * `int`, `bool`, `true`, `false`
    * `BoolVal`
    * `=?`, `<>`, `<?`, `<=?`, `>?`, `>=?`
  * TYPE1
    * Forward declaration, `declare`
    * `IntType`, `BoolType`, `ProcType`
  * OBJ
    * Class is a "template" to create an object or instance of the class
    * Static bindings
    * `this`, `self`, `super`, `myclass`, `superclass`
    * `ClassVal`, `ObjVal`
* Skills
  * Draw an environment diagram to show the environments created during the
    evaluation of code in NEED and the environments a `ProcVal` captures
  * Determine the value of a program written in SET, REF, NEED, TYPE1, or OBJ
  * Write a small program in SET, REF, NEED, TYPE1, or OBJ
  * Rewrite a `LetExp` as an `AppExp`
  * Apply currying to a function declaration
  * Know and use PLCC commands: `plccmk`, `scan`, `parse`, and `rep`
