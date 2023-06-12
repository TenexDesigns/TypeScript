When working with TypeScript, having a well-organized project structure can contribute to a better workflow.
One common approach is to have separate src and public folders.
Heres a suggested setup:

Project Structure:

        project/
        ├── src/
        │   ├── index.ts
        │   ├── ...
        │   └── (other TypeScript files)
        ├── public/
        │   ├── index.html
        │   ├── styles.css
        │   ├── index.js
        │   └── ...
        ├── tsconfig.json
        └── ...
        
The src folder is where you place your TypeScript source files.
The public folder contains static files such as HTML, CSS, images, and other assets.
tsconfig.json:
The tsconfig.json file is used to configure the TypeScript compiler and manage the TypeScript project settings. 
Heres an example configuration for the project structure mentioned above:

tsconfig.json

{
  "compilerOptions": {
    "target": "es5",
    "module": "commonjs",
    "strict": true,
    "outDir": "public",
    "rootDir": "src"
  },
  "include": [
    "src/**/*.ts"
  ],
  "exclude": [
    "node_modules"
  ]
}
"outDir": "public" specifies the output directory where the compiled JavaScript files will be generated.
You can change "public" to any other desired output folder name.
"rootDir": "src" indicates the root directory for TypeScript source files.
All TypeScript files under the src folder will be included for compilation.
Workflow:
During development, you can run the TypeScript compiler (tsc) to compile the TypeScript files in the src folder and generate the
JavaScript files in the specified outDir (e.g., dist) folder.

For example, assuming you have TypeScript installed globally, you can run the following command in the project root directory:


This will compile all the TypeScript files in the src folder based on the settings in tsconfig.json.

You can then reference the generated JavaScript files in your HTML file located in the public folder,
  allowing the browser to access and run the compiled code.

For example, in your index.html file:

<script src="../public/index.js"></script>
This setup separates the source code (src) from the distribution code (public),
  making it easier to manage and deploy your TypeScript project.

Remember to adjust the folder paths and configuration according to your specific project structure if
  it differs from the example provided.










MORE EXPLANANTION
********************************************************************************************************

  In the context of the tsconfig.json file, "src/**/*.ts" is a file glob pattern that specifies 
  which TypeScript files should be included for compilation.

Lets break down the pattern:

"src/": This part represents the base directory from where the search for TypeScript files will start.
In this case, it's the src folder.

"**/": The double asterisk (**) is a wildcard that matches any number of directories (including nested directories).

"*.ts": This pattern matches any file with the .ts extension.

Combining these parts together, "src/**/*.ts" means to include all TypeScript files (*.ts) found
in the src directory and its subdirectories.

For example, with the project structure mentioned earlier:

arduino
Copy code
project/
├── src/
│   ├── index.ts
│   ├── folder1/
│   │   ├── file1.ts
│   │   └── file2.ts
│   ├── folder2/
│   │   └── file3.ts
│   └── folder3/
├── public/
│   ├── index.html
│   └── styles.css
├── tsconfig.json
└── ...
The "src/**/*.ts" pattern will match the following files:

src/index.ts
src/folder1/file1.ts
src/folder1/file2.ts
src/folder2/file3.ts
These files will be included for compilation when you run the TypeScript compiler.

The use of the file glob pattern allows you to easily include multiple files or specify specific
file patterns to include or exclude from the compilation process.
It provides flexibility in defining which TypeScript files should be compiled based on the projects structure and organization.

















MORE EXPLANANTION
***************************************************************************************



To set up a better workflow with TypeScript and organize your project using src and public folders, you can leverage the tsconfig.json file to configure your TypeScript project. Here's how you can set up a TypeScript project with src and public folders:

Create a src folder to store your TypeScript source files and a public folder for your compiled JavaScript files and other public assets.
Create a tsconfig.json file in the root of your project directory. This file will contain your TypeScript configuration.
In the tsconfig.json file, configure the compilerOptions to include the outDir option, which specifies the output directory for your compiled JavaScript files. Set the outDir to the public folder:
{
  "compilerOptions": {
    "outDir": "public"
  },
  "include": ["src/**/*"],
  "exclude": ["node_modules"]
}
Use the include and exclude options in the tsconfig.json file to specify which files and folders should be included and excluded during compilation. In this case, we want to include all TypeScript files in the src folder and exclude the node_modules folder:
{
  "compilerOptions": {
    "outDir": "public"
  },
  "include": ["src/**/*"],
  "exclude": ["node_modules"]
}
To use custom path aliases for your imports, you can configure the baseUrl and paths options in the compilerOptions object. For example:
{
  "compilerOptions": {
    "baseUrl": "./src",
    "paths": {
      "app/*": ["app/*"],
      "config/*": ["app/_config/*"],
      "shared/*": ["app/_shared/*"],
      "helpers/*": ["helpers/*"]
    },
    "outDir": "public"
  },
  "include": ["src/**/*"],
  "exclude": ["node_modules"]
}
With this setup, your TypeScript source files will be located in the src folder, and the compiled JavaScript files will be output to the public folder. The custom path aliases will make it easier to import files from different parts of your project typescriptlang.org.

Remember to install TypeScript and any required dependencies in your project, and update your build and run scripts to use the public folder for serving your application.




























































..
