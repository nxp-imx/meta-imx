# Temp fix build with GCC 10
CFLAGS += "-fcommon"

addtask do_file_ownership after do_install before do_package

do_file_ownership[fakeroot] = "1"

do_file_ownership() {
  chown -R root:root "${D}"
}
