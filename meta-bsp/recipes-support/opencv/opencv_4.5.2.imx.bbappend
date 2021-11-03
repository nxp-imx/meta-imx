SRCREV_opencv = "5423d53ae0d116ee5bbe52f8b5503f0cd8586998"
PACKAGECONFIG_OPENCL:mx8mnul = ""
PACKAGECONFIG_OPENCL:mx8mpul = ""

# Temporary workaround until the gcc 11.2 build break is fixed
PACKAGECONFIG:remove:mx8    = "dnn"
