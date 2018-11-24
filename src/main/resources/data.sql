INSERT INTO public.roles(role_id, role_name) VALUES (1, 'ROLE_ADMIN');
	
INSERT INTO public.roles(role_id, role_name) VALUES (2, 'ROLE_USER');

INSERT INTO public.users(id, email, firstname, lastname, password, username) VALUES (1, 'sapandesai11@gmail.com', 'sapan', 'desai', 'admin', 'sapandesai');

INSERT INTO public.users_roles(user_id, role_id) VALUES (1, 1);