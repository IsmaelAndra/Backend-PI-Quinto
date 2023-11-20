build-image:
	@ docker build -f devops/Dockerfile -t salud360:1 .
volume:
	@ docker volume create salud360:1
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml kuyayana
rm:
	@ docker stack rm salud360
