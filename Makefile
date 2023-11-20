build-image:
	@ docker build -f devops/Dockerfile -t salud360:1 .
volume:
	@ docker volume create pg_salud360
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml salud360
rm:
	@ docker stack rm salud360
