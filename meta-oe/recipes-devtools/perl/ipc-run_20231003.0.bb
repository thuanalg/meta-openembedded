DESCRIPTION = "\
IPC::Run allows you run and interact with child processes \
using files, pipes, and pseudo-ttys. Both system()-style and scripted \
usages are supported and may be mixed. Likewise, functional and OO API \
styles are both supported and may be mixed."
HOMEPAGE = "https://metacpan.org/release/IPC-Run"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0ebd37caf53781e8b7223e6b99b63f4e"
DEPENDS = "perl"

SRC_URI = "git://github.com/toddr/IPC-Run.git;branch=master;protocol=https"
SRCREV = "ad56c3b5f5a211d32bbb8ac29f180d707ee58c1b"


inherit cpan

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

do_compile() {
    export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
    cpan_do_compile
}
