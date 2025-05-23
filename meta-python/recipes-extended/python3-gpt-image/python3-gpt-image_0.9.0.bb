DESCRIPTION = "GPT Image is used to Create GUID Partition Table disk images \
on local disks. Written in pure Python gpt-image allows GPT disk images to \
be built on a local filesystem and exported to a destination device."
SUMMARY = "GPT Image (pure python)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db5f8de88d13d0917db21293d0e82e1d"

DEPENDS += "python3-pip"

PYPI_PACKAGE = "gpt_image"
SRC_URI[sha256sum] = "c06d8efc7cf8d6f3954c1c3d8544f494aa95da37fe04e38a9699ad3f57455f7e"

inherit pypi python3native python_setuptools_build_meta ptest-python-pytest

do_install:append() {
	rm -fr ${D}${libdir}/python*/site-packages/gpt-image/__pycache__
}
