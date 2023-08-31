class Solution {
        public boolean isOperator(String token) {
            return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
        }

        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            // System.out.println("token = " + token);
            if (token.matches("-?\\d+")) {
                stack.push(Integer.parseInt(token));
                // System.out.println("stack = " + stack);
            } else if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        // System.out.println("+ stack = " + stack);
                        break;
                    case "-":
                        stack.push(a - b);
                        // System.out.println("- stack = " + stack);
                        break;
                    case "*":
                        stack.push(a * b);
                        // System.out.println("* stack = " + stack);
                        break;
                    case "/":
                        stack.push(a / b);
                        // System.out.println("/ stack = " + stack);
                        break;
                }
            }
        }

        return stack.peek();
        }
    }