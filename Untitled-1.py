import subprocess
import os
os.chdir("clients/ent-client2")
subprocess.run("mvnw spring-boot:run", shell=True, check=True)

subprocess.run("mvnw spring-boot:run", shell=True, check=True)