import os
import shutil
def recursive_overwrite(src, dest, ignore=None):
	if os.path.isdir(src):
		if not os.path.isdir(dest):
			os.makedirs(dest)
		files = os.listdir(src)
		if ignore is not None:
			ignored = ignore(src, files)
		else:
			ignored = set()
		for f in files:
			if f not in ignored:
				recursive_overwrite(os.path.join(src, f), os.path.join(dest, f), ignore)
	else:
		shutil.copyfile(src, dest)
try:		
	while True:
		cmd = raw_input("$")
		if cmd =="exit":
			break
		command = cmd.split()[0]
		src = cmd.split()[1]
		if command == "rmfile":
			os.remove(src)
			continue
		if command == "rmdir" and src!="*":
			shutil.rmtree(src)
			continue
		dst = cmd.split()[2]
		if command == "movefile":
			shutil.copy(src,dst)
			os.remove(cmd.split()[1])
		if command == "copydir":
			if not os.path.exists(dst):
				shutil.copytree(src,dst)
			else:
				recursive_overwrite(src,dst+"/"+src)
		if command == "movedir":
			shutil.move(src,dst)
		if command == "copyfile":
			shutil.copy(src, dst)
except Exception as e:
	print "Exiting from terminal"
	print e
